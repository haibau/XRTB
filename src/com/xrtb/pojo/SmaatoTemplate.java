package com.xrtb.pojo;

import com.xrtb.common.Campaign;
import com.xrtb.common.Creative;

public class SmaatoTemplate  {

	public static String  IMAGEAD_TEMPLATE = "" +
	"<ad>" +
	"<imageAd>" +
	"<clickUrl>__CLICKURL__</clickUrl>" +
	"<imgUrl>__IMAGEURL__</imgUrl>" +
	"<width>{campaign_ad_width}</width>" +
	"<height>{campaign_ad_height}</height>" +
	"<toolTip>__TOOLTIP__</toolTip>" +
	"<additionalText>__ADDITIONALTEXT__</additionalText>" +
	"<beacons>" +
	"<beacon>__PIXELURL__</beacon>" +
	"</beacons>" +
	"</imageAd>" +
	"</ad>";
	
	static String  TEXTAD_TEMPLATE = "" +
			"<ad>" +
			"<textAd>" +
			"<clickUrl>__CLICKURL__</clickUrl>" +
			"<clickTextl>__TEXT__</imgUrl>" +
			"<toolTip>__TOOLTIP__</toolTip>" +
			"<additionalText>__ADDITIONALTEXT__</additionalText>" +
			"<beacons>" +
			"<beacon>__PIXEL__</beacon>" +
			"</beacons>" +
			"</textAd>" +
			"</ad>";
	
	static String  RICHMEDIA_TEMPLATE = "" +
			"<ad>" +
			"<richMedia>" +
			"<content>" +
			"<![CDATA[ <script>__JAVASCRIPT__</script> ]]>" +
			"</content>" +
			"<width>{campaign_ad_width}</width>" +
			"<height>{campaign_ad_height}</height>" +
			"<beacons>" +
			"<beacon>__PIXEL__</beacon>" +
			"</beacons>" +
			"</richMedia>" +
			"</ad>";
	
}

