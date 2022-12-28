import { FancyBorder } from "./FancyBorder";

export function Login(){
    return (
        <FancyBorder>
            <form>
                <input type={'text'}></input>
                <br></br><br></br>
                <input type={'password'}></input>
                <br></br><br></br>
                <input type={'submit'}></input>
            </form>
        </FancyBorder>
    );
}