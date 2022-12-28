import { combineReducers } from "redux";
import { scoreReducer } from "./ScoreReducer";

export const rootReducer=combineReducers({scoreReducer})