<?php
include_once ("dataSetConnexion.php");
$emailErr=$pwdErr=$errMsg=$successMsg="";
if (isset($_GET['ok']))
{

 if (empty ($_GET['email']))
 {
 $emailErr = "Email is required";
 // echo $emailErr;
 }
 else
 {
 // $email="";
 $email= test_input($_GET['email']);
 // check if e-mail address syntax is valid or not
 // if (!preg_match("/([w-]+@[w-]+.[w-]+)/",$email))
 if(!filter_var($email, FILTER_VALIDATE_EMAIL))
 {
 $emailErr = "Error : Invalid email format";
 }

 }

 if (empty ($_GET['pwd']))
 {

 $pwdErr="Password is required";
 //echo $pwdErr;
 }

 else
 {
 //$pwd="";
 $pwd= test_input($_GET['pwd']);

 }


 if((!empty ($_GET['email']))&&(!empty ($_GET['pwd'])))
 {
 $sql="select * from users where (email='$email'&&
password=PASSWORD('$pwd'))";
 $result = $conn->query($sql);

 if ($result->num_rows > 0)
 {
 // output data of each row
 while($row = $result->fetch_assoc())
 {
 $successMsg= "id: " . $row["id"]. " /Name: " . $row["name"]. "
/email: " . $row["email"]. " /birthday: ". $row["dateNaissance"].
 " /Inscription date:". $row["dateInscription"]. "<br>";
 }
 }
 else
 {
 $errMsg="E-mail or password are invalid!";
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
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title></title>

<meta name="description" content="">
<meta name="viewport" content="width=device-width, initial-scale=1">
 <link href="../css/list.php" rel="stylesheet" type="text/css" media="all" />
</head>
<body>
<div class="jumbotron">
<div class="container">
<h2>Alerts</h2>
<div class="alert alert-success">
<strong>Success!</strong> <?php echo $successMsg;?>
</div>
<div class="alert alert-warning">
<strong><?php echo $emailErr;?></strong>
</div>
<div class="alert alert-warning">
<strong><?php echo $pwdErr;?></strong>
</div>
<div class="alert alert-warning">
<strong><?php echo $errMsg;?></strong>
</div>
</div>
</div>
<script type="text/javascript">
 // Add a script element as a child of the body
function downloadJSAtOnload() {
var element = document.createElement("script");
element.src = "../js/list.php";
document.body.appendChild(element);
}
// Check for browser support of event handling capability
if (window.addEventListener)
window.addEventListener("load", downloadJSAtOnload, false);
else if (window.attachEvent)
window.attachEvent("onload", downloadJSAtOnload);
else
window.onload = downloadJSAtOnload;
</script>

 </body>
</html>