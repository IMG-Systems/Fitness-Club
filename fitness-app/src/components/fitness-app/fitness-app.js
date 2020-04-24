import React, { Component } from 'react';
import { Link } from 'react-router-dom';
import './fitness-app.css';

class FitnessApp extends Component {

  constructor(props) {
    super(props)

    this.state = {
      uiReady: false,
      detailView: false,
      activeRestaurant: {},
      detailIn: false,
      allRestaurants: [],
      prevNextRestaurants: false,
      showMap: false
    }

  }

  //:
  componentDidMount() {

  }
  //#

  //: RENDER
  render() {
    return (
        <div>
            <div className="tfa-home-header">
                <h2>Welcome to TRAINR</h2>
                <p>Connecting people to trainers</p>
            </div>
            <div className="tfa-home-footer">
                <Link to="/login">LOG IN</Link>
                <Link to="/signup">Sign Up</Link>
            </div>
        </div>
    )
  }
  //#
}

export default FitnessApp;
