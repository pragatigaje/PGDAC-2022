import { useState } from "react";

export function ScoreCard(){
    const[score,setScore]=useState(0);
    
    const add=()=>setScore(score+1);

    const substract=()=>setScore(score-1);

    return(
            <div>
                <h1>{score}</h1>
                <input type="button" value='+' onClick={add}></input>
                <input type="button" value='-' onClick={substract}></input>
            </div>
    )
}




// import { Component } from "react";

// export class ScoreCard extends Component{
//     constructor(){
//         super();
//         this.state={
//             count:0
//         }
//     }

//     add=()=>{
//         this.setState({ count:this.state.count+1 })
//     }
//     substract=()=>{
//         this.setState({ count:this.state.count-1})
//     }
//     render(){
//         return(
//             <div>
//                 <h1>{this.state.count}</h1>
//                 <input type="button" value='+' onClick={this.add}></input>
//                 <input type="button" value='-' onClick={this.substract}></input>
//             </div>
//         );
//     }
// }