import {Component} from 'react';

export class NavigationBar extends Component{
    render(){
        return (
            <div>
                <ul>
                    <li><a href="#">Home</a></li>
                    <li><a href="#">About Us</a></li>
                    <li><a href="#">Contact Us</a></li>
                    <li><a href="#">Services</a></li>
                </ul>
            </div>
        );
    }
}