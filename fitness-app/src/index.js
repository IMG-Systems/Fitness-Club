import React from 'react';
import ReactDOM from 'react-dom';
import { Provider } from "react-redux";
import { createStore, applyMiddleware } from "redux";
import thunk from 'redux-thunk';

import 'css-reset-and-normalize';
import './index.css';
import App from './App';
import postReducer from './reducers/post-reducer';
import registerServiceWorker from './registerServiceWorker';

const store = createStore(postReducer, applyMiddleware(thunk));

ReactDOM.render(
	<Provider store={store}>
	<App />
	</Provider>, document.getElementById('fav-eats'));

registerServiceWorker();
