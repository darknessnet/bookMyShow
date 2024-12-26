<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ticket Booking Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
        }

        .container {
            width: 50%;
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

        .form-group {
            margin-bottom: 15px;
        }

        label {
            display: block;
            margin-bottom: 5px;
            color: #555;
        }

        input[type="text"],
        input[type="email"],
        input[type="number"],
        select {
            width: 95%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }

        button {
            width: 100%;
            padding: 10px;
            background-color: #28a745;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        button:hover {
            background-color: #218838;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Ticket Booking Form</h1>
        <form action="${pageContext.request.contextPath}/bookingTicket" method="POST">
            <div class="form-group">
                <label for="name">Name:</label>
                <input type="text" id="name" name="name" value="wick" required>
            </div>
            <div class="form-group">
                <label for="email">Email:</label>
                <input type="email" id="email" name="email" value="wick@gmail.com" required>
            </div>
            <div class="form-group">
                <label for="event">Select Movie:</label>
                <select id="event" name="event" required onchange="updateTheaterOptions()">
                    <option value="">--Select a Movie--</option>
                    <option value="pushpa-2">Pushpa 2</option>
                    <option value="12-fail">12 Fail</option>
                    <option value="stree-2">Stree 2</option>
                </select>
            </div>
            <div class="form-group">
                <label for="theater">Select Theater:</label>
                <select id="theater" name="theater" required onchange="updateTimeOptions()">
                    <option value="">--Select a Theater--</option>
                </select>
            </div>
            <div class="form-group">
                <label for="time">Select Time:</label>
                <select id="time" name="time" required>
                    <option value="">--Select a Time--</option>
                </select>
            </div>
            <button type="submit">Book Tickets</button>
        </form>
    </div>

    <script>
        function updateTheaterOptions() {
            const eventSelect = document.getElementById('event');
            const theaterSelect = document.getElementById('theater');
            const selectedEvent = eventSelect.value;
			console.log(selectedEvent);
            theaterSelect.innerHTML = '<option value="">--Select a Theater--</option>';

            let theaters = [];
            if (selectedEvent === 'pushpa-2') {
                theaters = ['Theater 1', 'Theater 2'];
            } else if (selectedEvent === '12-fail') {
                theaters = ['Theater 3', 'Theater 4'];
            } else if (selectedEvent === 'stree-2') {
                theaters = ['Theater 5', 'Theater 6'];
            }

            theaters.forEach(function(theater) {
                const option = document.createElement('option');
                option.value = theater;
                option.textContent = theater;
                theaterSelect.appendChild(option);
            });
        }

        function updateTimeOptions() {
            const theaterSelect = document.getElementById('theater');
            const timeSelect = document.getElementById('time');
            const selectedTheater = theaterSelect.value;

            timeSelect.innerHTML = '<option value="">--Select a Time--</option>';

            let times = [];
            if (selectedTheater === 'Theater 1') {
                times = ['10:00 AM', '1:00 PM', '4:00 PM'];
            } else if (selectedTheater === 'Theater 2') {
                times = ['11:00 AM', '2:00 PM', '5:00 PM'];
            } else if (selectedTheater === 'Theater 3') {
                times = ['12:00 PM', '3:00 PM', '6:00 PM'];
            } else if (selectedTheater === 'Theater 4') {
                times = ['10:30 AM', '1:30 PM', '4:30 PM'];
            } else if (selectedTheater === 'Theater 5') {
                times = ['11:15 AM', '2:15 PM', '5:15 PM'];
            } else if (selectedTheater === 'Theater 6') {
                times = ['12:45 PM', '3:45 PM', '6:45 PM'];
            }

            times.forEach(function(time) {
                const option = document.createElement('option');
                option.value = time;
                option.textContent = time;
                timeSelect.appendChild(option);
            });
        }
    </script>
</body>
</html>