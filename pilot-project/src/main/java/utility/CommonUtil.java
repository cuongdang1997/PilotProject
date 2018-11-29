package utility;

import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

/**
 * Common Utility
 * 
 * @author ThienMai
 * @since 17-10-2016
 */
public class CommonUtil {

	private static final Logger LOGGER = Logger.getLogger(CommonUtil.class);

	/**
	 * Check String null or empty
	 * 
	 * @param string
	 * @return boolean
	 */
	public static boolean isEmpty(Object string) {
		return string == null || Constants.EMPTY_STRING.equals(string);
	}

	/**
	 * Check List null or empty
	 * 
	 * @param List
	 * @return boolean
	 */
	@SuppressWarnings("rawtypes")
	public static boolean isEmpty(List list) {
		return list == null || list.isEmpty();
	}

	/**
	 * Convert String To TimeStamp
	 * 
	 * @param strDate
	 * @return Timestamp
	 */
	public static Timestamp cvStrToTimeStamp(String strDate) {

		Timestamp timestamp = null;
		if (!StringUtils.isEmpty(strDate)) {

			SimpleDateFormat dateFormat = new SimpleDateFormat(Constants.DATE_FORMAT_MMddyyyy);
			try {
				Date date = dateFormat.parse(strDate);
				return new Timestamp(date.getTime());
			} catch (ParseException e) {
				LOGGER.error(e.getMessage(), e);
			}
		}

		return timestamp;
	}

	/**
	 * Convert String MM/dd/yyyy To java.util.Date
	 * 
	 * @param String MM/dd/yyyy
	 * @return Date
	 */
	public static Date cvMMddyyyToDate(String dateStr) {

		Date date = null;
		if (!StringUtils.isEmpty(dateStr)) {

			SimpleDateFormat dateFormat = new SimpleDateFormat(Constants.DATE_FORMAT_MMddyyyy);
			try {
				date = dateFormat.parse(dateStr);
			} catch (ParseException e) {
				LOGGER.error(e.getMessage(), e);
			}
		}

		return date;
	}

	/**
	 * Convert time To MMddYYYY
	 * 
	 * @param strDate
	 * @return dateMMddYYYY
	 */
	public static String cvTimeToMMddYYYY(String strDate) {

		String dateMMddYYYY = Constants.EMPTY_STRING;
		if (!StringUtils.isEmpty(strDate)) {

			SimpleDateFormat dateFormatInput = new SimpleDateFormat(Constants.DATE_FORMAT_yyyyMMddHHmmss);
			SimpleDateFormat dateFormatOutput = new SimpleDateFormat(Constants.DATE_FORMAT_MMddyyyy);
			try {
				Date date = dateFormatInput.parse(strDate);
				return dateFormatOutput.format(date);
			} catch (ParseException e) {
				LOGGER.error(e.getMessage(), e);
			}
		}

		return dateMMddYYYY;
	}

	/**
	 * Convert time To MMddYYYY
	 * 
	 * @param strDate
	 * @return dateMMddYYYY
	 */
	public static String cvTimeToMMddYYYY(Date date) {

		String dateMMddYYYY = Constants.EMPTY_STRING;
		if (date != null) {

			SimpleDateFormat dateFormatOutput = new SimpleDateFormat(Constants.DATE_FORMAT_MMddyyyy);
			dateMMddYYYY = dateFormatOutput.format(date);
		}

		return dateMMddYYYY;
	}

	/**
	 * Convert time To yyyyMMdd
	 * 
	 * @param strDate
	 * @return String Date yyyyMMdd
	 */
	public static String cvTimeToyyyyMMdd(String strDate) {

		String dateMMddYYYY = Constants.EMPTY_STRING;
		if (!StringUtils.isEmpty(strDate)) {

			SimpleDateFormat dateFormatInput = new SimpleDateFormat(Constants.DATE_FORMAT_MMddyyyy);
			SimpleDateFormat dateFormatOutput = new SimpleDateFormat(Constants.DATE_FORMAT_yyyyMMdd);
			try {
				Date date = dateFormatInput.parse(strDate);
				return dateFormatOutput.format(date);
			} catch (ParseException e) {
				LOGGER.error(e.getMessage(), e);
			}
		}

		return dateMMddYYYY;
	}

	/**
	 * Convert time To yyyyMMdd
	 * 
	 * @param strDate
	 * @return String Date yyyyMMdd
	 */
	public static Date cvStringToyyyyMMdd(String strDate) {

		Date dateMMddYYYY = null;
		if (!StringUtils.isEmpty(strDate)) {

			SimpleDateFormat dateFormatInput = new SimpleDateFormat(Constants.DATE_FORMAT_MMddyyyy);
			try {
				dateMMddYYYY = dateFormatInput.parse(strDate);
			} catch (ParseException e) {
				LOGGER.error(e.getMessage(), e);
			}
		}

		return dateMMddYYYY;
	}

	/**
	 * Append Criteria With Operator
	 * 
	 * @param fieldName
	 * @param fieldValue
	 * @param operator
	 * @return String
	 */
	public static String appendCriteria(String fieldName, Object fieldValue, String operator) {

		String strQuery = Constants.EMPTY_STRING;
		if (!CommonUtil.isEmpty(fieldValue)) {
			strQuery = String.format(Constants.CRITERIAL_COMPARE, fieldName, operator,
					fieldValue.toString().toUpperCase().trim());
		}
		return strQuery;
	}

	/**
	 * Append Like Criteria
	 * 
	 * @param fieldName
	 * @param fieldValue
	 * @return String
	 */
	public static String appendCriteriaLike(String fieldName, String fieldValue) {

		String strQuery = Constants.EMPTY_STRING;
		if (!CommonUtil.isEmpty(fieldValue)) {
			strQuery = String.format(Constants.CRITERIAL_LIKE, fieldName, fieldValue.toUpperCase().trim());
		}
		return strQuery;
	}

	/**
	 * Append Between Criteria
	 * 
	 * @param fieldName
	 * @param fromValue
	 * @param toValue
	 * @return String
	 */
	public static String appendCriteriaBetween(String fieldName, String fromValue, String toValue) {

		String strQuery = Constants.EMPTY_STRING;
		if (!CommonUtil.isEmpty(fromValue) && !CommonUtil.isEmpty(toValue)) {
			strQuery = String.format(Constants.CRITERIAL_BETWEEN, fieldName, fromValue, toValue);
		}
		return strQuery;
	}

	/**
	 * Append Criteria Date With Operator
	 * 
	 * @param fieldName
	 * @param fieldValue
	 * @param operator
	 * @return String
	 */
	public static String appendCriteriaDate(String fieldName, String fieldValue, String operator) {

		String strQuery = Constants.EMPTY_STRING;

		if (!CommonUtil.isEmpty(fieldValue)) {
			strQuery = String.format(Constants.CRITERIAL_DATE_COMPARE, fieldName, operator, fieldValue);
		}
		return strQuery;
	}

	/**
	 * convert To Decimal
	 * 
	 * @param value
	 * @return Money Format
	 */
	public static String convertToDecimal(double value) {

		DecimalFormat myFormatter = new DecimalFormat(Constants.MONEY_FORMAT);
		return myFormatter.format(value);
	}
}