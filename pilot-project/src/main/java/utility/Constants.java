/*
*
* Copyright (c) 2007 HEB
* All rights reserved.
*
* This software is the confidential and proprietary information
* of HEB.
*/
package utility;

/**
 * Constant Utility
 * 
 * @author ThienMai
 * @since 17-10-2016
 */
public class Constants {

	public static final String EMPTY_STRING = "";
	public static final String EQUAL_COMPARE = "=";
	public static final String GREATER_COMPARE = ">";
	public static final String LESS_COMPARE = "<";

	public static final String DATE_FORMAT_MMddyyyy = "MM/dd/yyyy";
	public static final String DATE_FORMAT_yyyyMMdd = "yyyy/MM/dd";
	public static final String DATE_FORMAT_yyyyMMddHHmmss = "yyyy-MM-dd HH:mm:ss";

	public static final String CRITERIAL_LIKE = "AND (UPPER(%s) LIKE '%%%s%%') ";
	public static final String CRITERIAL_COMPARE = "AND (UPPER(%s) %s '%s') ";
	public static final String CRITERIAL_DATE_COMPARE = "AND (DATE(%s) %s '%s') ";
	public static final String CRITERIAL_BETWEEN = "AND (UPPER(%s) BETWEEN %s AND %s) ";
	public static final String SORT_STRING_AS_NUMBER = "length(%s) %s, %s %s";
	public static final String SORT_STRING_WITH_UTF_8 = "%s COLLATE utf8_persian_ci %s";
	public static final String SORT_NUMBER = "%s %s";

	public static final String KEY_LIST_CATEGORY = "listCategory";
	public static final String KEY_LIST_ITEM = "listItem";
	public static final String KEY_ITEMDTO = "itemDTO";
	public static final String KEY_ITEMDTO_SEARCHING = "itemDTOSearching";

	public static final String SQL_STATEMENT = "SQL Statement: ";

	public static final String COL_NAME_ITEM_ID = "id";
	public static final String COL_NAME_ITEM_NAME = "name";
	public static final String COL_NAME_ITEM_CATEGORYID = "categoryId";
	public static final String COL_NAME_ITEM_PRICE = "price";
	public static final String COL_NAME_ITEM_QUANTITY = "quantity";
	public static final String COL_NAME_ITEM_DISCOUNT = "discount";
	public static final String COL_NAME_ITEM_DESC = "discription";
	public static final String COL_NAME_ITEM_IMAGEURL = "imageUrl";
	public static final String COL_NAME_ITEM_AUTHOR = "author";
	public static final String COL_NAME_ITEM_PUBLISHER = "publisher";
	public static final String COL_NAME_ITEM_PUBLISHEDYEAR = "publishedYear";
	public static final String NO_IMAGE_URL = "no-image.jpg";

	/**
	 * MONEY FORMAT
	 */
	public static final String MONEY_FORMAT = "###,###,###.###";

	/**
	 * SORT_DIR.
	 */
	public static final String SORT_DIR = "order[0][dir]";
	/**
	 * SORT_COLUMN.
	 */
	public static final String SORT_COLUMN = "order[0][column]";

	/**
	 * AA_DATA.
	 */
	public static final String AA_DATA = "data";
	/**
	 * ITOTAL_DISPLAY_RECORDS.
	 */
	public static final String ITOTAL_DISPLAY_RECORDS = "recordsFiltered";
	/**
	 * ITOTAL_RECORDS.
	 */
	public static final String ITOTAL_RECORDS = "recordsTotal";
	/**
	 * S_ECHO.
	 */
	public static final String S_ECHO = "draw";
}