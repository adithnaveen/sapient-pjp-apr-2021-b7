// all user transaction code goes here 


/**
 * @author Naveen
 */



function fnGetUser() {
        
    let userId  =getValueById("user-id");
    console.log(userId);
    fetch(URL + userId)
        .then(resp =>   resp.json())
        .then(resp =>  {
            fnPutValueToID("email", resp.email)
            fnPutValueToID("name", resp.name)
            fnPutValueToID("dob", resp.dob)
            document.querySelector("#user-id").value ="";
            document.querySelector("#user-id").focus();
        });
}


/**
 * @author Naveen
 */
function fnPostUser() {
    let obj  = {
        email:"hello@hi.com", 
        name :"Hello User", 
        dob: "10-10-2020",
        userid:"U443", 
        password:"keepguessing"
    }; 

    // obj.email = getValueById("email")
    // obj.name = getValueById("name")
    // obj.dob = getValueById("dob")

    fetch(URL, 
        {
            method:"POST", 
            body: JSON.stringify(obj),
            headers : {
                "Content-Type":"application/json"
            }
        }
    )
    .then(resp => console.log("resp from server ", resp))
    .catch(err => console.warn(err))
}