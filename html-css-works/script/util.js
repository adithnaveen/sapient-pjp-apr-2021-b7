
// utility code goes here 
// const URL ="https://chat-b7.herokuapp.com/api/users/";
const URL ="http://localhost:8080/api/users/"

const  getValueById = (id) =>  document.getElementById(id).value; 
 
function fnPutValueToID(id, data) {
    document.getElementById(id).innerHTML = data; 
}
