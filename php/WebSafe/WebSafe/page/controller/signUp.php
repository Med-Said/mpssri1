<?php
include_once ("dataSetConnexion.php");
// define variables and set to empty values
$nameErr=$anniErr=$emailErr=$pwdErr=$errMsg=$Reppwd=$pwdDiff=$ReppwdErr=$emailerror="";
//data reception
if (isset($_POST['ok']))
{
if (empty ($_POST['name']))
{
$nameErr = "Name is required";
}
else
{
$name= test_input ($_POST['name']);
// check name only contains letters and whitespace
if (!preg_match("/^[a-zA-Z ]*$/",$name))
{
$nameErr = "Name error : Only letters and white space allowed";
}
}
if (empty ($_POST['anniversaire']))
{
$anniErr="Birthdate is required";
}
else
{
$anniversaire= test_input ($_POST['anniversaire']);
}
if (empty ($_POST['email']))
{
$emailErr = "Email is required";
}
else
{
$email= test_input ($_POST['email']);
if(!filter_var($email, FILTER_VALIDATE_EMAIL))
{



$emailErr = "Error : Invalid email format";
}
}
if (empty ($_POST['pwd']))
{
$pwdErr="Password is required";
}
else
{
$pwd= test_input ($_POST['pwd']);
}
if (empty ($_POST['psw-repeat']))
{
$ReppwdErr="Repeat password is required";
}
else
{
$Reppwd= test_input ($_POST['psw-repeat']);
}
if ($pwd!=$Reppwd)
{
$pwdDiff= "Error:There is an error when you have repeated your
password. Try aigain.";
}
if((!empty ($_POST['name']))&& (!empty ($_POST['anniversaire']))&& (!empty
($_POST['email']))&&(!empty
($_POST['pwd']))&&($pwd==$Reppwd)&&($nameErr=="")&&($emailErr==""))
{
$sql="select * from users where email='$email'";
$result = $conn->query($sql);
if ($result->num_rows > 0)
{
$emailerror= "Error: This e-mail: $email already exist!";
}
else
{
$dateInscription=date("Y-m-d h:i:sa");
$grade="user";
$sql = "INSERT INTO users (id, email, password, name, dateNaissance,
dateInscription, grade)
VALUES ('', '$email', PASSWORD('$pwd'), '$name', '$anniversaire',
'$dateInscription', '$grade')";
if ($conn->query($sql) === TRUE)
{
echo "New record created successfully";
}
else
{
echo "Error : " . $sql . "<br>" . $conn->error;
}
}
}
else
{
$errMsg="Error : Some field are invalid";
}
}


function test_input($data)
{
$data = trim($data);
$data = stripslashes($data);
$data = htmlspecialchars($data);
return $data;
}
$conn->close();
?>
<html>

<head>
</head>

<body>
    <div class="jumbotron">
        <div class="container">
            <h2>Alerts</h2>
            <div class="alert alert-warning">
                <strong>
                    <?php echo $nameErr;?></strong>
            </div>
            <div class="alert alert-warning">
                <strong>
                    <?php echo $anniErr;?></strong>
            </div>
            <div class="alert alert-warning">
                <strong>
                    <?php echo $emailErr;?></strong>
            </div>
            <div class="alert alert-warning">
                <strong>
                    <?php echo $pwdErr;?></strong>
            </div>
            <div class="alert alert-warning">
                <strong>
                    <?php echo $errMsg;?></strong>
            </div>
            <div class="alert alert-warning">
                <strong>
                    <?php echo $ReppwdErr;?></strong>
            </div>
            <div class="alert alert-warning">
                <strong>
                    <?php echo $pwdDiff;?></strong>
            </div>
            <div class="alert alert-warning">
                <strong>
                    <?php echo $emailerror;?></strong>
            </div>
            <div> <a href="../index.php"> Back to home </a></div>
        </div>
    </div>
</body>

</html>