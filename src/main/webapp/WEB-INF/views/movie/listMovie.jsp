<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="com.yash.bookMyShow.model.Ticket" %>
<html>
<head>
    <title>BookMyShow</title>
    <link rel="stylesheet" href="styles.css">
<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f4f4f4;
	margin: 0;
	padding: 0;
}

.container {
	width: 80%;
	max-width: 800px;
	margin: 50px auto;
	padding: 20px;
	background: white;
	border-radius: 5px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

h1 {
	text-align: center;
	color: #333;
}

.movie {
	border: 1px solid #ddd;
	border-radius: 5px;
	padding: 15px;
	margin-bottom: 20px;
	background-color: #fafafa;
}

.movie h2 {
	margin: 0 0 10px;
	color: #007BFF;
}
</style>
</head>
<body>
    <div class="container">
        <h1>Movies List</h1>
       <%--  <%
            // Sample data - in a real application, this would come from a database
            List<Ticket> movies = (List<Ticket>) request.getAttribute("movies");
            if (movies == null && !movies.isEmpty()) {
                for (Ticket movie : movies) {
        %> --%>
        	<div class="movie">
                <h2>pushpa</h2>
                <p><strong>Genre:</strong>genere</p>
                <p><strong>Rating:</strong>9/10</p>
                <p><strong>Release Date:</strong>23/5</p>
                <p><strong>Duration:</strong>2:30</p>
                <p><strong>Director:</strong>wick</p>
                <p><strong>Cast:</strong>john</p>
            </div>
            <div class="movie">
                <h2>pushpa 2</h2>
                <p><strong>Genre:</strong>genere</p>
                <p><strong>Rating:</strong>7/10</p>
                <p><strong>Release Date:</strong>23/5</p>
                <p><strong>Duration:</strong>2:30</p>
                <p><strong>Director:</strong>wick</p>
                <p><strong>Cast:</strong>john</p>
            </div>
            <%-- <div class="movie">
                <h2><%= movie.getMovieTitle() %></h2>
                <p><strong>Genre:</strong> <%= movie.getGenre() %></p>
                <p><strong>Rating:</strong> <%= movie.getRating() %>/10</p>
                <p><strong>Release Date:</strong> <%= movie.getReleaseDate() %></p>
                <p><strong>Duration:</strong> <%= movie.getDuration() %></p>
                <p><strong>Director:</strong> <%= movie.getDirector() %></p>
                <p><strong>Cast:</strong> <%= movie.getCast() %></p>
            </div> --%>
       <%--  <%
                }
            } else {
        %>
            <p>No movies available.</p>
        <%
            }
        %> --%>
    </div>
</body>
</html>