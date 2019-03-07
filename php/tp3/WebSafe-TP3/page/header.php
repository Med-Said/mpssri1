<?php 
session_start ();
?>

<div class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">Votre site</a>
        </div>
        <div class="navbar-collapse collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a href="index.php">accueil</a></li>
            <li><a href="#about">A propos</a></li>
            <li><a href="#contact">Contact</a></li>
            
            <!-- depend on session -->
<?php             
            if (isset($_SESSION['mail'])) 
            {
                echo 
                '<li class="dropdown active">            
            <a href="#" class="dropdown-toggle" data-toggle="dropdown"> Hello ' .  session_name()  . $_SESSION['name']. '<b class="caret"></b></a>
              <ul class="dropdown-menu">
                <li><a href="#">Nous contacter</a></li>
                <li><a href="index.php?page=page1">Page 1</a></li> 
                <li class="divider"></li>
                <li><a href="./page/logout.php">Logout</a></li>
              </ul>
            </li>' ;
            }
            ?>
          </ul>
           
	         <form class="navbar-form navbar-right">
	            <div class="form-group">
	              <input type="text" style="width:120px;" placeholder="Recherche" class="form-control">
	            </div>
	             
	            <button type="submit" class="btn btn-success"><i class="fa fa-search"></i></button>
	          </form>
	       
        </div><!--/.navbar-collapse -->
      </div>
    </div>