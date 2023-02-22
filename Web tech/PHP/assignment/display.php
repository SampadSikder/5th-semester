<html>

<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <style>
        body {
            font-style: bold;
            font-family: Arial, Helvetica, sans-serif;
            font-size: 20px;
        }

        .upldimg {
            float: right;
            padding-right: 50px;
        }
    </style>
</head>

<body>
    <?php foreach ($_POST as $val) {
        if (empty($val))
            echo "<script>alert('You have not filled up all the inputs')</script>";
    }
    ?>
    <?php
    $photoName = $_FILES['photo']['name'];
    ?>


    Name:
    <?php
    echo $_POST["fName"] . " " . $_POST["lName"];
    ?><br>


    <div class="upldimg">
        <?php
        $im = "<img src=$photoName width=\"300px;\" style=\"border-radius: 200px\">";
        echo $im;
        ?>
    </div>

    Email:
    <?php
    echo $_POST["email"];
    ?><br>

    Address:
    <?php
    echo $_POST["addr"];
    ?><br>






</html>