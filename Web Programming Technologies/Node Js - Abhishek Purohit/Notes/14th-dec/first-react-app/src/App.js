import logo from './logo.svg';
import './App.css';
import { Home } from './Home';
import { NavigationBar } from './NavigationBar';
import { ScoreBoard } from './ScoreBoard';
import { RegistrationForm } from './RegistrationForm';

function App() {
  return (
    <div>
      <NavigationBar></NavigationBar>
      <RegistrationForm></RegistrationForm>
      {/* <ScoreBoard></ScoreBoard> */}
      {/* <Home name='Ajay' age='24'></Home> */}
    </div>
  );
}

export default App;
