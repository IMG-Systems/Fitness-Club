import axios from "axios";

export const GET_RESTAURANTS_BEGIN   = 'GET_RESTAURANTS_BEGIN';
export const GET_RESTAURANTS_SUCCESS = 'GET_RESTAURANTS_SUCCESS';
export const GET_RESTAURANTS_FAILURE = 'GET_RESTAURANTS_FAILURE';

export const getRestaurantsBegin = () => ({
  type: GET_RESTAURANTS_BEGIN
});

export const getRestaurantsSuccess = restaurants => ({
  type: GET_RESTAURANTS_SUCCESS,
  payload: { restaurants }
});

export const getRestaurantsError = error => ({
  type: GET_RESTAURANTS_FAILURE,
  payload: { error }
});


export function getRestaurants(props) {

  return dispatch => {
    dispatch(getRestaurantsBegin());

    //:
    return axios({
    	method: "get",
    	url: "https://s3.amazonaws.com/br-codingexams/restaurants.json"
    })
    .then(response => {
    	
		setTimeout(() => {
      props.uiStatus(true)
      props.updateBeforeNext(true,response.data.restaurants);

			dispatch(getRestaurantsSuccess(response.data.restaurants));
		},500);

    })
	.catch(error => {
		throw(error);
	});
	//#

  };
}
