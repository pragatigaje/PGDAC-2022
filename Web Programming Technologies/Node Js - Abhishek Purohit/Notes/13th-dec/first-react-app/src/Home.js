export function Home(props){
    return (
        <div>
            <h1>Welcome {props.name},  to home </h1>
            <p>You are {props.age} years old</p>
        </div>
    );
}