import logo from './logo.svg';
import './App.css';
import { Home } from './Home';
import { NavigationBar } from './NavigationBar';
import { ScoreBoard } from './ScoreBoard';

function App() {
  return (
    <div>
      {/* <NavigationBar></NavigationBar> */}
      <h1>Hello world</h1>
      {/* <Home name='Pragati' age='21' ></Home> */}
      <ScoreBoard></ScoreBoard>
    </div>
  );
}

export default App;
