import { useState } from "react";

export function Login(){
    const[formData,setFormData]=useState({});
    const handleChange=(event)=>{
        setFormData({...formData,[event.target.name]:event.target.value});
    }
    const handleSubmit=(event)=>{
        event.preventDefault();
        console.log(formData);
    }
    return(
        <div>
            <form onSubmit={handleSubmit}>
                <input
                    type="text" placeholder="Enter Name" name="name" onChange={handleChange}></input>
                <br></br>
                <input type="password" placeholder="Enter Password" name="password" onChange={handleChange}></input>
                <br></br>
                <input type="submit" value="Login"></input>
            </form>
        </div>
    )
}