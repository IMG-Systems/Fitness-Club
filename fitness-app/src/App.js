import React from 'react';
import {
	BrowserRouter as Router,
	Switch,
	Route,
} from 'react-router-dom';
import './App.css';
import FitnessApp from './components/fitness-app/fitness-app';
import FitnessSignUp from './components/fitness-app/fa-signup/fa-signup';
import FitnessSignUpFlow from './components/fitness-app/fa-signup/fa-signup-flow';
import FitnessCreateAccount from './components/fitness-app/fa-create-account/fa-create-account';
import FitnessTermsConditions from './components/fitness-app/fa-terms-conditions';
import FitnessBusinessManager from './components/fitness-app/fa-business-manager';
import FitnessBusinessApplication from './components/fitness-app/fa-business-manager/fa-business-application';
import FitnessBackgroundApplication from './components/fitness-app/fa-business-manager/fa-background-application';

export default function FAPaths() {
  return (
    <Router>
      <div className="tfa">
        <div className="tfa-container">
          <Switch>
            <Route path="/signup">
              <FitnessSignUp />
            </Route>

            <Route
              path="/signup-flow"
              render={({ match: { url } }) => (
                <div>
                  <Route path={`${url}/:slug`} component={FitnessSignUpFlow} />
                </div>
              )}
            />

            <Route path="/create-account">
              <FitnessCreateAccount />
            </Route>

            <Route path="/terms-conditions">
              <FitnessTermsConditions />
            </Route>

            <Route path="/business-manager">
              <FitnessBusinessManager />
            </Route>

            <Route path="/business-application">
              <FitnessBusinessApplication />
            </Route>

            <Route path="/background-application">
              <FitnessBackgroundApplication />
            </Route>

            <Route path="/login">
              <FitnessSignUp />
            </Route>

            <Route path="/">
              <FitnessApp />
            </Route>
          </Switch>
        </div>
      </div>
    </Router>
  );
}

