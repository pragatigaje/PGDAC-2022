import { Component } from "react";

export class Greet extends Component{
    constructor(){
        super();
        this.state={
            msg:"Hello"
        }
    }
    changeText=()=>{
        this.setState({
            msg:"Helllo Pragati"
        })
    }
    render(){
        return(
            <div>
                <h3>{this.state.msg}</h3>
                <button value='ClickMe' onClick={this.changeText}>ClickMe</button>
            </div>
        )
    }
}


// import { useState } from "react"

// export function Greet(){
//     const[msg,showMsg]=useState("Good Morning");
//     const changeText=()=>{
//         showMsg("Hello Pragati");
//     }
//     return(
//         <div>
//             <h3>{msg}</h3>
//             <button value='ClickMe' onClick={changeText}>ClickMe</button>
//         </div>
//     )
// }