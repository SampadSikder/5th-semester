<html>

<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <style>
        .row {
            margin-top: 50px;
        }

        button {
            padding: 10px;
            border-radius: 10px;
        }

        #submit {
            background-color: green;
            color: white;
            margin-left: 45%;
        }

        #cancel {
            background-color: red;
            color: white;
        }
    </style>

</head>

<body>
    <form class="form-horizontal" action="display.php" method="post" enctype="multipart/form-data">
        <div class="form-group">
            <label class="control-label col-sm-2" for="fName">First Name:</label>
            <div class="col-sm-3">
                <input type="text" class="form-control" name="fName" id="fName" required></input>
            </div>
            <label class="control-label col-sm-2" for="lName">Last Name:</label>
            <div class="col-sm-3">
                <input type="text" class="form-control" name="lName" id="lName"></input>
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="email">Email:</label>
            <div class="col-sm-8"><input type="email" class="form-control" id="email" name="email" required></input>
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="addr">Address:</label>
            <div class="col-sm-8"><input type="text-area" class="form-control" id="addr" name="addr"></input>
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="photo">Upload photo:</label>
            <div class="col-sm-2">
                <input type="file" class="form-control" id="photo" name="photo"></input>
            </div>
        </div>

        <button type="submit" value="Submit" id="submit">Submit</button>
        <button type="reset" value="Reset" id="cancel">Cancel</button>

    </form>
</body>

</html>