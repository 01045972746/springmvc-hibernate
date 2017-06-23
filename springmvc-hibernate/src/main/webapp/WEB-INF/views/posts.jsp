<%@include file="includes/head.jsp"%>
<body>
<%@include file="includes/navigation.jsp"%>

<!-- Page Content -->
<div class="container">

    <div class="row">

        <!-- Blog Entries Column -->
        <div class="col-md-8">

            <h1 class="page-header">
                Page Heading
                <small>Secondary Text</small>
            </h1>


            <!-- Blog POSTS -->
            <c:forEach var="item" items="${posts}" begin="0" varStatus="status">
                <h2>
                    <a href="<c:url value="/post/${item.p_id}"/>">${item.p_tit}</a>
                </h2>
                <p class="lead">
                    by <a href="mailto:jonghan.kim@cdnetworks.co.kr">jonghan</a>
                </p>

                <!-- Converting UnixTimeStamp to Date -->
                <jsp:useBean id="postdate" class="java.util.Date"/>
                <jsp:setProperty name="postdate" property="time" value="${item.p_rg_dt}"/>

                <p><span class="glyphicon glyphicon-time"></span> Posted on <fmt:formatDate value="${postdate}"
                                                                                            pattern="MM/dd/yyyy HH:mm"/>
                </p>
                <hr>
                    <c:if test = "${item.p_photos.size() > 0}">
                        <c:forEach var="photo" items="${item.p_photos}" begin="0" varStatus="pstatus">
                            <img class="img-responsive" src="${photo.h_path}" alt="">
                        </c:forEach>
                    </c:if>
                    <c:if test = "${item.p_photos.size() eq 0}">
                        <img class="img-responsive" src="https://goo.gl/M2xgk6" alt="">
                    </c:if>
                <hr>
                <p>
                    <span class="glyphicon glyphicon-comment"></span>
                    <c:if test="${item.p_comments.size() eq 0}">
                        <a href="/post/<c:out value="${item.p_id}"/>">
                            0 comment
                        </a>
                    </c:if>
                    <c:if test="${item.p_comments.size() > 0}">
                        <a href="/post/<c:out value="${item.p_id}"/>">
                            <c:out value="${item.p_comments.size()}"/> comments
                        </a>
                    </c:if>

                </p>
                <a class="btn btn-primary" href="/post/<c:out value="${item.p_id}"/>">
                    Read More <span class="glyphicon glyphicon-chevron-right"></span>
                </a>
                <hr>
            </c:forEach>


            <!-- Pager -->
            <ul class="pager">
                <li class="previous">
                    <a href="#">&larr; Older</a>
                </li>
                <li class="next">
                    <a href="#">Newer &rarr;</a>
                </li>
            </ul>

        </div>

        <!-- Blog Sidebar Widgets Column -->
        <div class="col-md-4">

        <%@include file="includes/sidebar.jsp"%>

        </div>

    </div>
    <!-- /.row -->

    <hr>

<%@include file="includes/footer.jsp"%>
</div>
<!-- /.container -->
<%@include file="includes/tail.jsp"%>

</body>

</html>
