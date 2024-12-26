<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Seat Booking</title>
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

        #seatSelection {
            display: flex;
            flex-wrap: wrap;
            justify-content: space-between;
        }

        .seat {
            flex: 0 0 calc(10% - 10px);
            height: 50px;
            margin: 5px;
            background-color: white;
            border: 2px solid #007BFF;
            border-radius: 5px;
            cursor: pointer;
            font-size: 20px;
            transition: background-color 0.3s, border-color 0.3s;
            display: flex;
            align-items: center;
            justify-content: center;
        }

        .seat.selected {
            background-color: black;
            border-color: #FFD700;
            color: white;
        }

        #processBooking {
            display: block;
            width: 100%;
            padding: 10px;
            background-color: #28a745;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            font-size: 16px;
            margin-top: 20px;
        }

        #processBooking:hover {
            background-color: #218838;
        }

        #selectedSeats {
            margin-top: 20px;
            font-size: 18px;
            color: #333;
        }
        
        #screenLine {
            height: 3px;
            background-color: black;
            width: 100%;
            text-align: center;
        }
    </style>
</head>
<body>
    <div class="container">
        <div id="screenLine"><br>Screen</div><br>
        <h1>Select Your Seats</h1>
        <div id="seatSelection"></div>
        <form id="bookingForm" action="${pageContext.request.contextPath}/processTicket" method="POST" onsubmit="return updateSeats()">
            <input type="hidden" name="name" value="${name}">
            <input type="hidden" name="email" value="${email}">
            <input type="hidden" name="event" value="${event}">
            <input type="hidden" name="theater" value="${theater}">
            <input type="hidden" name="time" value="${time}">
            <input type="hidden" name="seats" id="seatsInput" value="0">
            <input type="hidden" name="seatsNumber" id="seatsNumber" value="0">
            <button type="submit" id="processBooking">Process Booking</button>
        </form>
        <div id="selectedSeats"></div><br>
        <h1>Booking $20 per Ticket</h1>
        <p>Name: ${name}</p>
        <p>Email: ${email}</p>
        <p>Event: ${event}</p>
        <p>Theater: ${theater}</p>
        <p>Time: ${time}</p>
        <a href="${pageContext.request.contextPath}/listMovie">Book Another Movie</a>
    </div>

    <script>
        let selectedSeats = [];

        function toggleSeat(button) {
            const seatNumber = button.innerText;

            if (selectedSeats.includes(seatNumber)) {
                selectedSeats = selectedSeats.filter(seat => seat !== seatNumber);
                button.classList.remove('selected');
            } else {
                selectedSeats.push(seatNumber);
                button.classList.add('selected');
            }

            document.getElementById('selectedSeats').innerText = `Selected Seats: ` + selectedSeats.join(', ');
        }

        function updateSeats() {
        	document.getElementById('seatsNumber').value = selectedSeats;
            document.getElementById('seatsInput').value = selectedSeats.length; 
            if (selectedSeats.length === 0) {
                alert("Please select at least one seat.");
                return false; 
            }
            return true; 
        }

        function createSeatButtons() {
            const seatSelection = document.getElementById('seatSelection');
            for (let i = 1; i <= 50; i++) {
                const button = document.createElement('button');
                button.className = 'seat';
                button.innerText = i;
                button.onclick = function() { toggleSeat(this); };
                button.setAttribute('aria-label', `Select seat ${i}`);
                seatSelection.appendChild(button);
            }
        }

        createSeatButtons();
    </script>
</body>
</html>