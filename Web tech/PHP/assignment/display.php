<html>

<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <style>
        .upldimg {
            display: inline;
        }
    </style>
</head>

<body>
    <?php
    $fileName = $_FILES['photo']['name'];
    ?>
    <div class="row">
        <div class="col-lg-5">
            Name:
            <?php
            echo $_POST["fName"] . " " . $_POST["lName"];
            ?>
        </div>
        <div class="col-lg-5">
            <div class="upldimg">
                <?php
                echo "<image src= $fileName>";
                ?>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-5">
            Email:
            <?php
            echo $_POST["email"];
            ?>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-5">
            Address:
            <?php
            echo $_POST["addr"];
            ?>
        </div>
    </div>




</html>