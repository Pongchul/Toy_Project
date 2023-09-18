import React, { useEffect, useState } from 'react';
import logo from './logo.svg';
import './App.css';

function App() {

  let post = "강남 우동 맛집";
  let [title,setTitle] = useState(["남자 코트 추천","강남 우동 맛집","파이썬 독학"]);
  let [date, setDate] = useState("2월 17일 발행");
  let [like, setLike] = useState(0);


  return (
      <div className="App">
        <div className="black-app">
          <h4> ReactBlog </h4>
        </div>
    
        <button onClick={() => {
          let copy = [...title];
          copy.sort();
          setTitle(copy);
        }}> 정렬 버튼</button>

        <button onClick={() => {
            let copy = [...title];
            copy[0] = '여자 코트 추천';
            setTitle(copy);
          }}>글수정</button>
        <div className="list">
          <h4> { title[0] } <span onClick={ () => setLike(like+1)}> 👍 </span> {like}</h4>
          <p> { date }</p>
        </div>
        <div className="list">
          <h4> { title[1] } </h4>
          <p> { date }</p>
        </div>
        <div className="list">
          <h4> { title[2] } </h4>
          <p> { date }</p>
        </div>

        <DetailModal></DetailModal>

        <h4>{ post }</h4>
      </div>
  );
}

function DetailModal() {
  return (
    <div className="modal">
      <h4>제목</h4>
      <p>날짜</p>
      <p>상세내용</p>
    </div>
  );

}

export default App;
