import { Component } from "react";

export class RegistrationForm extends Component {
    constructor(){
        super();
        this.state = {
            name:'',
            password: '',
            phone: '',
            email:''
        }
    }
    handleChange = (event)=>{
        this.setState({[event.target.name]:event.target.value});
    }
    
    handleSubmit = (event)=>{
        event.preventDefault();
        console.log(this.state);
    }
    render(){
       return( <div>
            <form onSubmit={this.handleSubmit}>
                <input type='text' placeholder="enter name" name="name" onChange={this.handleChange}></input>
                <br></br><br></br>
                <input type='password' placeholder="enter password" name="password" onChange={this.handleChange}></input>
                <br></br><br></br>
                <input type='text' placeholder="enter phone" name="phone" onChange={this.handleChange}></input>
                <br></br><br></br>
                <input type='email' placeholder="enter email" name="email" onChange={this.handleChange}></input>
                <br></br><br></br>
                <input type='submit' value='Register'></input>
            </form>
        </div>
       );
    }
}