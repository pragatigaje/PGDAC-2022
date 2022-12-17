import { Component } from "react";

export class RegistrationForm extends Component {
  constructor() {
    super();
    this.state = {
      name: "",
      password: "",
      phone: "",
      email: ""
    };
  }
//   handleNameChange = (event) => { this.setState({name:event.target.value})};
//   handlePasswordChange = (event) => { this.setState({name:event.target.value})};
//   handlePhoneNoChange = (event) => { this.setState({name:event.target.value})};
//   handleEmailChange = (event) => { this.setState({name:event.target.value})};
  
  handleChange=(event)=>{
    this.setState({
        [event.target.name]:event.target.value
    });
  }
  handleSubmit =(event)=>{
    event.preventDefault();
    console.log(this.state);
  }

  render() {
    return (
      <div>
        <h3>Registration Form</h3>
        <form onSubmit={this.handleSubmit}>
          <input
            type="text" placeholder="Enter Name" name="name" onChange={this.handleChange}></input>
          <br></br>
          <input type="password" placeholder="Enter Password" name="password" onChange={this.handleChange}></input>
          <br></br>
          <input type="text" placeholder="Enter Phone No" name="phone" onChange={this.handleChange}></input>
          <br></br>
          <input type="email" placeholder="Enter Email" name="email" onChange={this.handleChange}></input>
          <br></br>
          <input type="submit" value="Register"></input>
        </form>
      </div>
    );
  }
}
