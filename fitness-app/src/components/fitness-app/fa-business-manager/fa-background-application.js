import React, { Component } from 'react';
import './fa-business-manager.css';

class FitnessBackgroundApplication extends Component {

  //:
  componentDidMount() {
    
  }
  //#

  //: RENDER
  render() {
    return (
        <div className="tfa-background-application">
            <span>Background Application Form</span>
            <form className="tfa-business-application-form">
                <input type="text" placeholder="Legal First Name" />
                <input type="text" placeholder="Legal Last Name" />
                <input className="tfa-margin-top" type="text" placeholder="Home Address" />
                <input type="text" placeholder="Home City" />
                <input type="text" placeholder="Home State" />
                <input type="text" placeholder="Home Zip Code" />
                <input className="tfa-margin-top" type="text" placeholder="Social Security Number" />
                <button>Submit Application</button>
            </form>
        </div>
    )
  }
  //#
}

export default FitnessBackgroundApplication;
