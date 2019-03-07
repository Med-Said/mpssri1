 
 <!-- Main jumbotron for a primary marketing message or call to action -->
    <div class="jumbotron">
      <div class="container">
        <h1>Bienvenue sur votre site</h1>
        <p>Apprenez à créer un site web sécurisé </p>
        <p><a class="btn btn-primary btn-lg" href="http://creersonsiteweb.net">Plus &raquo;</a></p>
      </div>
    </div>
    
    
      <!-- Example row of columns -->
      <div class="container">
      <div class="row">
        <div class="col-lg-4">
        
        <?php             
            if (!isset($_SESSION['mail'])) 
            {
                echo '
               
        <h2>Get connexion</h2>
        <div class="panel panel-default">
        <div class="panel-body">
        
        <!--Login HTML code-->
        
        <button type="button" class="btn btn-primary btn-block" data-toggle="modal" data-target="#myModal"><b>Login</b></button>
        </div>
        </div>
          
          <div class="modal fade" id="myModal" role="dialog">
          <div class="modal-dialog">
  
   <div class="modal-content">
   
         <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal">&times;</button>
        </div>
        
        <div class="modal-body">
        <form action="./page/login.php"  method="post">
       <!-- <form action="./page/loginWithGet.php"  method="get">-->
    
        <div class="form-group">
        <label for="email">Email address:</label>
        <input type="email" class="form-control" name="email">
        </div>

        <div class="form-group">
        <label for="pwd">Password:</label>
        <input type="password" class="form-control" name="pwd">
        </div>        
    
          <div class="checkbox">
            <label><input type="checkbox"> Remember me</label>
          </div>
          <button type="submit" class="btn btn-success" name="ok">Submit</button>
		</form>
		</div>
		
		<div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
    </div>
    </div>
    </div>

                <!--signUp HTML code-->
        
        <div class="panel panel-default">
        <div class="panel-body">       
        <button type="button" class="btn btn-primary btn-block" data-toggle="modal" data-target="#myModal1" ><b>SignUp</b></button>
        </div>
        </div>        
        
         
          <div class="modal fade" id="myModal1" role="dialog">
          <div class="modal-dialog">
  
          <div class="modal-content">
   
        <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal">&times;</button>
        <h1>Sign Up</h1>
        <p>Please fill in this form to create an account.</p>
        </div>
       
      <div class="modal-body">
     <form action="./page/signUp.php"  method="post">       
          
      <div class="form-group">
      <label for="name">Name :</label>
      <input type="text" placeholder="Enter your name" class="form-control" name="name"> 
              
      </div>
      
      <label for="birthdate">Birthdate :</label>
      <input type="date" placeholder="Enter your birthdate" class="form-control" name="anniversaire">
                  
        <div class="form-group">
        <label for="email">Email address:</label>
        <input type="email" class="form-control" placeholder=" Enter your Email address" name="email">
        </div>
  
        <div class="form-group">
        <label for="pwd">Password:</label>
        <input type="password" placeholder="Enter your password" class="form-control" name="pwd">
        </div>
      
       <div class="form-group">
      <label for="psw-repeat">Repeat Password :</label>
      <input type="password" placeholder="Repeat Password" class="form-control" name="psw-repeat">
      </div>
      
          <div class="checkbox">
          <label><input type="checkbox"> Remember me</label>
          </div>

      <p>By creating an account you agree to our <a href="#" style="color:dodgerblue">Terms and Privacy</a>.</p>

      <div>        
        <button type="submit" class="btn btn-success" name="ok" >Sign Up</button>
     </div>
      
     </form>
     </div>
     
 		<div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>  
   
</div>
</div>
</div>
';       
         
           } ?>
   
               
         <!-- 
          <h2>Explication 1</h2>
          <p>Votre texte votre texte votre texte votre texte votre texte votre texte votre texte votre texte votre texte votre texte votre texte votre texte votre texte votre texte votre texte votre texte votre texte votre texte votre texte</p>
          <p><a class="btn btn-default" href="#">Plus de détails &raquo;</a></p>
          -->
       
        </div>
        <div class="col-lg-4">
          <h2>Explication 2</h2>
          <p> votre texte votre texte votre texte votre texte votre texte votre texte votre texte votre texte votre texte votre texte votre texte votre texte votre texte votre votre texte texte votre texte votre texte votre texte votre texte votre texte</p>
          <p><a class="btn btn-default" href="#">Plus de détails &raquo;</a></p>
       </div>
        <div class="col-lg-4">
          <h2>Explication 3</h2>
          <p> votre texte votre texte votre texte votre texte votre texte votre texte votre texte votre texte votre texte votre texte votre texte votre texte votre texte votre texte votre texte votre texte votre texte votre texte votre texte votre texte</p>
          <p><a class="btn btn-default" href="#">Plus de détails &raquo;</a></p>
        </div>
      </div>
     </div>