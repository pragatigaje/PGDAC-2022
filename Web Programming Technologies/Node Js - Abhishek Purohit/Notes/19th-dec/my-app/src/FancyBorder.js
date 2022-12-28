import './MyStyle.css';

export function FancyBorder(props){
    return (
        <>
            <div className="green-border">
                {props.children}
            </div>
        </>
    );
}