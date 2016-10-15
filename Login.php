<?php 
$con = new COM('ADODB.Connection');
$con->Open("DRIVER={Microsoft Access Driver (*.mdb, *.accdb)}; DBQ=C:\\Desktop\\EntryDatabase.accdb");


$username = $_POST["username"];  
$password = $_POST["password"];  


 $username = stripslashes($username);
 $password = stripslashes($password);

if(isset($_POST['username'])) {
      $username = $_POST["username"];;
    }
   if(isset($_POST['password'])) {
   $password = $_POST["password"];
}

if (!empty($_POST))
{
   if (empty($_POST['username']) || empty($_POST['password']))
   {
      // Create some data that will be the JSON response
      $response["success"] = 0;
      $response["username"] = "One or both of the fields are empty .";

      //die is used to kill the page, will not let the code below to be executed. It will also
      //display the parameter, that is the json data which our android application will parse to be
      //shown to the users

      die(json_encode($response));
   }

   $sql1 = " SELECT FirstName from  LoginInformation WHERE Username = '$username' and Password='$password'";

 $row = $con->Execute($sql1);


   if (!empty($row))
   {
      $response["success"] = 1;
     $response["success"] = true;  
	$response["username"] = $username;
        $response["password"] = $password;
      die(json_encode($response));
   }

   else
   {
      $response["success"] = 0;
      $response["username"] = "invalid username or password ";
      die(json_encode($response));

   }
}

else
{
   $response["success"] = 0;
   $response["username"] = " One or both of the fields are empty ";
   die(json_encode($response));
}

echo json_encode($response); 
print_r(json_encode($response));
?>