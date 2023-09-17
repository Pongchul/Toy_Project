import React, { useEffect, useState } from 'react';
import logo from './logo.svg';
import './App.css';

function App() {

  let post = "강남 우동 맛집";
  let [글제목1,b1] = useState(["남자 코트 추천","강남 우동 맛집","파이썬 독학"]);
  let [date, setDate] = useState("2월 17일 발행")

  return (
      <div className="App">
        <div className="black-app">
          <h4> ReactBlog </h4>
        </div>
        <div className="list">
          <h4> { 글제목1[0] } </h4>
          <p> { date }</p>
        </div>
        <div className="list">
          <h4> { 글제목1[1] } </h4>
          <p> { date }</p>
        </div>
        <div className="list">
          <h4> { 글제목1[2] } </h4>
          <p> { date }</p>
        </div>
        <h4>{ post }</h4>
      </div>
  );
}

export default App;
