<?php 
$con = new COM('ADODB.Connection');
$con->Open("DRIVER={Microsoft Access Driver (*.mdb, *.accdb)}; DBQ=C:\\Desktop\\EntryDatabase.accdb");



$FirstName = $_POST["FirstName"];  
$LastName = $_POST["LastName"];  
$Username = $_POST["username"];  
$Password = $_POST["password"];  

$sql1="INSERT INTO LoginInformation (FirstName, LastName, Username, Password) VALUES ('$FirstName', '$LastName' ,'$Username','$Password')";

$result = $con->Execute($sql1);

$response = array(); 
$response["success"] = true;   

print_r(json_encode($response));
?> 