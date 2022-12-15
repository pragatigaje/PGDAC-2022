import { useState } from "react";

export function ScoreBoard() {
    const [score,setScore]=useState(0);
    const increaseScore=()=>{
        setScore(score+1);
    }
    return (
        <div>
            <h1>{score}</h1>
            <input type='button' value='+' onClick={increaseScore}></input>
            <input type='button' value='-'></input>
        </div>
    );
}

// import { Component } from "react";

// export class ScoreBoard extends Component{
//     constructor(){
//         super();
//         this.state={
//             score:0
//         }
//     }
//     increaseScore=()=>{
//         this.setState({score:this.state.score+1});
//     }
//     decreaseScore=()=>{
//         this.setState({score:this.state.score-1});
//     }
//     render(){
//         return (
//             <div>
//                 <h1>{this.state.score}</h1>
//                 <input type='button' value='+' onClick={this.increaseScore}></input>
//                 <input type='button' value='-' onClick={this.decreaseScore}></input>
                
//             </div>
//         );
//     }
// }