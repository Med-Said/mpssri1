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
    //echo $nameErr;   
    
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
   // echo $anniErr;
    
}
else
{
    //$anniversaire="";
    $anniversaire= test_input ($_POST['anniversaire']);

}

if (empty ($_POST['email']))
{
    $emailErr = "Email is required";
   // echo $emailErr;
}
else
{
   // $email="";
    $email= test_input ($_POST['email']);
    // check if e-mail address syntax is valid or not
    // if (!preg_match("/([w-]+@[w-]+.[w-]+)/",$email)) 
   if(!filter_var($email, FILTER_VALIDATE_EMAIL))
     {
         $emailErr = "Error : Invalid email format";
     }

}

if (empty ($_POST['pwd']))
{
    $pwdErr="Password is required";
    //echo $pwdErr;
}

else
{
    //$pwd="";
    $pwd= test_input ($_POST['pwd']);

}

if (empty ($_POST['psw-repeat']))
{
    $ReppwdErr="Repeat password is required";
    //echo $pwdErr;
}

else
{
    //$pwd="";
    $Reppwd= test_input ($_POST['psw-repeat']);
    
}

if ($pwd!=$Reppwd)
{
    $pwdDiff= "Error:There is an error when you have repeated your password. Try aigain.";
}


if((!empty ($_POST['name']))&& (!empty ($_POST['anniversaire']))&& (!empty ($_POST['email']))&&(!empty ($_POST['pwd']))&&($pwd==$Reppwd)&&($nameErr=="")&&($emailErr==""))

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
    
    $sql = "INSERT INTO users (id, email, password, name, dateNaissance, dateInscription, grade) 
    VALUES ('', '$email', PASSWORD('$pwd'), '$name', '$anniversaire', '$dateInscription', '$grade')";
    
    //mysql_query($query) or die("could not insert data");
   // $result = $conn->query($sql);
   
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
//mysqli_close();
?>

<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title></title>
<meta name="description" content="">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link  href="./css/list.php" rel="stylesheet" type="text/css" media="all" />

</head>
<body>

<div class="jumbotron">
<div class="container">
<h2>Alerts</h2>

<div class="alert alert-warning">
<strong><?php echo $nameErr;?></strong>
</div>

<div class="alert alert-warning">
<strong><?php echo $anniErr;?></strong>
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

<div class="alert alert-warning">
<strong><?php echo $ReppwdErr;?></strong>
</div>

<div class="alert alert-warning">
<strong><?php echo $pwdDiff;?></strong>
</div>

<div class="alert alert-warning">
<strong><?php echo $emailerror;?></strong>
</div>

<div> <a href="../index.php"> Back to home </a></div>

</div>
</div>

<script type="text/javascript">       

    // Add a script element as a child of the body
	function downloadJSAtOnload() {
		var element = document.createElement("script");
		element.src = "./js/list.php";
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