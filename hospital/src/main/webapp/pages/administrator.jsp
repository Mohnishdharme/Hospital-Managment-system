<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Hospital Staff</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 20px;
        }

        .popup-container {
            display: none;
            position: fixed;
            top: 0;
            left: 0;
            width: 100%;
            height: 100%;
            background-color: rgba(0, 0, 0, 0.5);
            justify-content: center;
            align-items: center;
        }

        .popup {
            background-color: white;
            padding: 20px;
            border-radius: 8px;
            width: 300px;
            box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
        }

        .popup h2 {
            margin-top: 0;
            font-size: 20px;
            color: #333;
        }

        .popup label {
            display: block;
            margin-bottom: 5px;
            font-weight: bold;
        }

        .popup input, .popup select {
            width: 100%;
            padding: 8px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }

        .popup .actions {
            text-align: right;
        }

        .popup .actions button {
            padding: 8px 15px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        .popup .actions .save-btn {
            background-color: #28a745;
            color: white;
            margin-right: 5px;
        }

        .popup .actions .close-btn {
            background-color: #dc3545;
            color: white;
        }
    </style>
</head>
<body>
    <h1>Lata Mangeshkar Hospital</h1>
    <button onclick="openPopup()">Add Hospital Staff</button>

    <div class="popup-container" id="popupContainer">
        <div class="popup">
            <h2>Add Staff Details</h2>
            <form action="addStaff" method="post">
                <label for="name">Name:</label>
                <input type="text" id="name" name="name" required>

                <label for="position">Position:</label>
                <select id="position" name="position" required>
                    <option value="Senior Doctor">Senior Doctor</option>
                    <option value="Junior Doctor">Junior Doctor</option>
                    <option value="Nurse">Nurse</option>
                    <option value="Staff">Staff</option>
                </select>

                <label for="specialization">Specialization:</label>
                <input type="text" id="specialization" name="specialization">

                <label for="age">Age:</label>
                <input type="number" id="age" name="age" required>

                <label for="gender">Gender:</label>
                <select id="gender" name="gender" required>
                    <option value="Male">Male</option>
                    <option value="Female">Female</option>
                    <option value="Other">Other</option>
                </select>

                <label for="mobile">Mobile No.:</label>
                <input type="text" id="mobile" name="mobile" required>

                <div class="actions">
                    <button type="submit" class="save-btn">Save</button>
                    <button type="button" class="close-btn" onclick="closePopup()">Close</button>
                </div>
            </form>
        </div>
    </div>
    
    
    

    <script>
        function openPopup() {
            document.getElementById('popupContainer').style.display = 'flex';
        }

        function closePopup() {
            document.getElementById('popupContainer').style.display = 'none';
        }
    </script>
</body>
</html>
