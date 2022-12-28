import { configureStore } from "@reduxjs/toolkit";
import { rootReducer } from "./reducers/RootReducer";

export const store=configureStore({reducer:rootReducer})