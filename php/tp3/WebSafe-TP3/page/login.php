<?php
include_once ("dataSetConnexion.php");

$emailErr=$pwdErr=$errMsg=$successMsg= $messageUser=$messageAdmin= $grade=$name=$mail=$password="";

if (isset($_POST['ok']))
{
    
    if (empty ($_POST['email']))
    {
        $emailErr = "Email is required";
        // echo $emailErr;
    }
    else
    {
        // $email="";
        $email= test_input($_POST['email']);
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
        $pwd= test_input($_POST['pwd']);
        
    }
    
    
    if((!empty ($_POST['email']))&&(!empty ($_POST['pwd'])))
    {
        $sql="select * from users where (email='$email'&& password=PASSWORD('$pwd'))";
        $result = $conn->query($sql);
        
        if ($result->num_rows > 0)
        {
            // output data of each row
            while($row = $result->fetch_assoc()) 
            {
                $successMsg= "id: " . $row["id"]. " /Name: " . $row["name"]. " /email: " . $row["email"]. " /birthday: ". $row["dateNaissance"]. 
                " /Inscription date:". $row["dateInscription"]. "<br>";
            //}
            
            $name=$row["name"];
            $mail=$row["email"];
            $grade=$row["grade"];
            $password=$row["password"];
            
            // on démarre une session
            session_start ();
            $_SESSION['name'] = $name;
            $_SESSION['mail']= $mail;
            $_SESSION['grade'] = $grade;
           // $_SESSION['pwd']= $password;
            
            
            if($_SESSION['grade']=="user")
            {
                header("Location: ../index.php");
                exit();
                
               // $messageUser = '<p> Hello User :'.$_SESSION['name'].', '.$_SESSION['mail'].', you are now connected!</p>
			   //  <p> Clic <a href="../index.php"> here </a> to go to home page </p>';
            }
            
           else if ($_SESSION['grade']=="admin")
            {
                header("Location: ../index.php");
                exit();
                
               // $messageAdmin= '<p>Hello Admin :'.$_SESSION['name'].', '.$_SESSION['mail'].', you are now connected!</p>
			   // <p> Clic <a href="../index.php"> here</a> to go to home page </p>';
                
               }
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

  <link  href="../css/list.php" rel="stylesheet" type="text/css" media="all" />  

</head>
<body>

<div class="jumbotron">
<div class="container">

<h2>Alerts</h2>

<div class="alert alert-success">
<strong>Success!</strong> <?php echo $successMsg;?>
<p> <?php echo $messageUser; ?> </p>
<p> <?php echo $messageAdmin; ?> </p>
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