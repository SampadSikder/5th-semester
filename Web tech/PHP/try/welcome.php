<!DOCTYPE html>
<html lang="en">

<body>
    <?php
    define("cars", ["Romeo", "Jaguar"]);
    echo cars[0];

    $x = 10;

    echo "sum is" . $x;

    $x = array(1, 2, 3);

    echo "<br>";

    for ($i = 0; $i < count($x); $i++) {
        echo $x[$i];
        echo "<br>";
    }

    echo $_POST["name"]; ?><br>
    Your date of birth
    <?php echo "Date of birth: " . $_POST["dob"]; ?>

</body>

</html>