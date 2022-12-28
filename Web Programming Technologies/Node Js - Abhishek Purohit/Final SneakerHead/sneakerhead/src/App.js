// import logo from './logo.svg';
import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import { SignUpForm } from './components/SignUpForm';
// import { NavigationBar } from './components/NavigationBar';
import { FooterSN } from "./components/FooterSN";
import { NavBar } from './components/NavBar';
import { BrowserRouter } from 'react-router-dom';
import { Route, Routes } from 'react-router';
import {Body} from './components/Body';
import {Signin} from './components/Signin';
import { ProductRequest } from './components/ProductRequest';
import { RequestList } from './components/RequestList';
import { Brands } from './components/Brands';
import {Shop} from './components/Shop';
import ScrollToTop from './components/ScrollToTop';
import { Auth0Provider } from "@auth0/auth0-react";
import {AboutUs} from './components/AboutUs'
import {PrivacyPolicy} from './components/PrivacyPolicy';
import {TermsAndConditions} from './components/TermsAndConditions';
import {TermsOfService} from './components/TermsOfService';
import {ContactUs} from './components/ContactUs';
function App() {
  return (
     <Auth0Provider
        domain="dev-sjrzcvapynqwj4n5.us.auth0.com"
        clientId="nzGKdaW2iIfzueyrX7q9TcmF7KrO4nOW"
        redirectUri={window.location.origin}
    >
    <div>
      <BrowserRouter>
        <NavBar></NavBar>
        <Routes>
          <Route path='/sign-in' element={<Signin></Signin>}></Route>
          <Route path='/shop' element={<Shop></Shop>}></Route>
          <Route path='/request-product' element={<ProductRequest></ProductRequest>}></Route>
          <Route path='/view-request' element={<RequestList></RequestList>}></Route>
          <Route path='/brands' element={<Brands></Brands>}></Route>
          <Route path='/sign-up' element={<SignUpForm></SignUpForm>}></Route>
          <Route path='/' element={<Body></Body>}></Route>
          <Route path='/aboutus' element={<AboutUs></AboutUs>}></Route>
          <Route path='/privacypolicy' element={<PrivacyPolicy></PrivacyPolicy>}></Route>
          <Route path='/termsandcondition' element={<TermsAndConditions></TermsAndConditions>}></Route>
          <Route path='/termsofservice' element={<TermsOfService></TermsOfService>}></Route>
          <Route path='/contactus' element={<ContactUs></ContactUs>}></Route>
        </Routes>
        <ScrollToTop></ScrollToTop>
        <FooterSN></FooterSN>
      </BrowserRouter>
    </div>
    </Auth0Provider>
  );
}

export default App;
