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
                    by <a href="index.php">jonghan</a>
                </p>
                <p><span class="glyphicon glyphicon-time"></span> Posted on ${item.p_rg_dt}</p>
                <hr>
                <img class="img-responsive" src="http://placehold.it/900x300" alt="">
                <hr>
                <p>${item.p_cnt}</p>
                <a class="btn btn-primary" href="#">Read More <span class="glyphicon glyphicon-chevron-right"></span></a>

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
