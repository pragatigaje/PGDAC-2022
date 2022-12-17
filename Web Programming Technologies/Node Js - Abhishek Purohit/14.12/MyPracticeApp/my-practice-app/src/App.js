import logo from './logo.svg';
import './App.css';
import { Hello } from './Components/Hello';
import { ScoreCard } from './Components/ScoreCard';
import { RegistrationForm } from './Components/Form';
import { Login } from './Components/Login';
import { Greet } from './Components/Greet';
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import { NavigationBar } from './Components/NavigationBar';
import 'bootstrap/dist/css/bootstrap.min.css';
import { Home } from './Components/Home';

function App() {
  return (
    <div>
      <BrowserRouter>
        <NavigationBar></NavigationBar>
        <Routes>
          <Route path='/' element={<Home></Home>}></Route>
          <Route path='/score-card' element={<ScoreCard></ScoreCard>}></Route>
          <Route path='/sign-up' element={<RegistrationForm></RegistrationForm>}></Route>
          <Route path='/login' element={<Login></Login>}></Route>
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
