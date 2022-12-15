import logo from './logo.svg';
import './App.css';
import { Hello } from './Components/Hello';
import { ScoreCard } from './Components/ScoreCard';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <Hello name='Pragati Gaje' age="21"></Hello>
        <ScoreCard></ScoreCard>   
      </header>
    </div>
  );
}

export default App;
