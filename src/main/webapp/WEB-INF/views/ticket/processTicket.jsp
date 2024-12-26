<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Booking Confirmation</title>
</head>
<body>
    <div class="container">
        <h1>Booking Confirmation</h1>
        <p>Name: ${name}</p>
        <p>Email: ${email}</p>
        <p>Event: ${event}</p>
        <p>Theater: ${theater}</p>
        <p>Time Amount: ${time}</p>
        <p>Count of Seats: ${seats}</p>
        <p>Number of Seats: ${seatsNumber}</p>
        <p>Total Amount: $${totalAmount}</p>
        <a href="${pageContext.request.contextPath}/listMovie">Book Another Ticket</a>
    </div>
</body>
</html>