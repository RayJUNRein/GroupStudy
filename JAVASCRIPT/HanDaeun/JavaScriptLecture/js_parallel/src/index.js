import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import reportWebVitals from './reportWebVitals';
import PromiseParallelTest from './promise-parallel/PromiseParallelTest';
import PromiseParallelTest2 from './promise-parallel/PromiseParallelTest2';
import PromiseParallelTest3 from './promise-parallel/PromiseParallelTest3';
import PromiseParallelTest4 from './promise-parallel/PromiseParallelTest4';
import PromiseParallelTest5 from './promise-parallel/PromiseParallelTest5';
import PromiseParallelTest6 from './promise-parallel/PromiseParallelTest6';
import PromiseParallelTest7 from './promise-parallel/PromiseParallelTest7';
import Test from './promise-parallel/Test';
import TestPromiseVersion from './promise-parallel/TestPromiseVersion';

ReactDOM.render(
  <React.StrictMode>
    <PromiseParallelTest/>
    <PromiseParallelTest2/>
    <PromiseParallelTest3/>
    <PromiseParallelTest4/>
    <PromiseParallelTest5/>
    <PromiseParallelTest6/>
    <PromiseParallelTest7/>
    <Test/>
    <TestPromiseVersion/>
  </React.StrictMode>,
  document.getElementById('root')
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();