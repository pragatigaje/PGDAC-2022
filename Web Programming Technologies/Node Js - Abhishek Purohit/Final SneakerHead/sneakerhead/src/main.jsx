import React from "react";
import ReactDOM from "react-dom";
import App from "./App";
import { Auth0Provider } from "@auth0/auth0-react";

ReactDOM.createRooot(document.getElementById("root")).render(
    <Auth0Provider
        domain="dev-sjrzcvapynqwj4n5.us.auth0.com"
        clientId="nzGKdaW2iIfzueyrX7q9TcmF7KrO4nOW"
        redirectUri={window.location.origin}
    >
        <App/>
    </Auth0Provider>,
    document.getElementById("root")
);