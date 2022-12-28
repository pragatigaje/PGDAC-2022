import { useDispatch, useSelector } from "react-redux";
import { scoreDecrementAction, scoreIncrementAction } from "./actions/ScoreActions";

export function ScoreBoard(){

        var score=useSelector(state=>state.scoreReducer);
        const dispatch=useDispatch();
        return (
            <>
            <h1>{score}</h1>
            <input type={'button'} value='+' onClick={()=>{
                dispatch(scoreIncrementAction());
            }}></input>
            <input type={'button'} value='-' onClick={()=>{
                dispatch(scoreDecrementAction());
            }}></input>
            </>
        );
    
    
}