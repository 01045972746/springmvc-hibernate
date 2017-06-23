<%--
  Created by IntelliJ IDEA.
  User: jong-850
  Date: 2017-06-22
  Time: 오후 8:47
  To change this template use File | Settings | File Templates.
--%>
<%@include file="includes/head.jsp" %>
<body>
<%@include file="includes/navigation.jsp" %>

<!-- Page Content -->
<div class="container">

    <div class="row">

        <!-- Blog Post Content Column -->
        <div class="col-lg-8">

            <!-- Blog Post -->

            <!-- Title -->
            <h1><c:out value="${post.p_tit}"/></h1>

            <!-- Author -->
            <p class="lead">
                by <a href="#">jonghan</a>
            </p>

            <hr>

            <!-- Date/Time -->
            <p><span class="glyphicon glyphicon-time"></span> Posted on <c:out value="${post.p_rg_dt}"/></p>

            <hr>

            <!-- Preview Image -->
            <c:forEach var="photo" items="${post.p_photos}" begin="0" varStatus="status">
                <img class="img-responsive" src="${photo.h_path}" alt="">
                <hr>
            </c:forEach>

            <!-- Post Content -->
            <p class="lead">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ducimus, vero, obcaecati, aut,
                error quam sapiente nemo saepe quibusdam sit excepturi nam quia corporis eligendi eos magni recusandae
                laborum minus inventore?</p>

            <p>${post.p_cnt}</p>

            <hr>

            <!-- Blog Comments -->

            <!-- Comments Form -->
            <div class="well">
                <h4>Leave a Comment:</h4>
                <form role="form">
                    <div class="form-group">
                        <textarea class="form-control" rows="3"></textarea>
                    </div>
                    <button type="submit" class="btn btn-primary">Submit</button>
                </form>
            </div>

            <hr>

            <!-- Posted Comments -->

            <!-- Comment -->
            <c:if test="${post.p_comments.size() > 0}">
            <c:forEach var="comments" items="${post.p_comments}" begin="0" varStatus="status">
                <div class="media">
                    <a class="pull-left" href="#">
                        <img class="media-object" src="http://placehold.it/64x64" alt="">
                    </a>
                    <div class="media-body">
                        <h4 class="media-heading">${comments.c_crt}
                            <small>${comments.c_rg_dt}</small>
                        </h4>
                            ${comments.c_cnt}
                    </div>
                </div>
            </c:forEach>
            </c:if>
            <c:if test="${post.p_comments.size() eq 0}">
                <p class="lead">No Comments</p>
            </c:if>


        </div>

        <!-- Blog Sidebar Widgets Column -->
        <div class="col-md-4">

            <%@include file="includes/sidebar.jsp" %>

        </div>

    </div>
    <!-- /.row -->

    <hr>

    <%@include file="includes/footer.jsp" %>
</div>
<!-- /.container -->

<%@include file="includes/tail.jsp" %>

</body>

</html>