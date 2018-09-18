/**
 * Copyright 2018 人人开源 http://www.renren.io
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package io.renren.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 大盘查询表单
 *
 * @author Mark sunlightcs@gmail.com
 * @since 3.1.0 2018-01-25
 */
@ApiModel(value = "大盘查询表单")
public class DgjjMarketForm {
	
	/**
	 * 大盘ID
	 */
    @ApiModelProperty(value = "大盘ID")
	private String marketId;

	/**
	 * 技术名称
	 */
    @ApiModelProperty(value = "技术名称")
	private String techName;
    /**
	 * 技术领域
	 */
    @ApiModelProperty(value = "技术领域: A、人工智能 "
    		+ "B、精细化工"
    		+ "C、先进装备制造"
    		+ "D、清洁能源"
    		+ "E、船舶和海洋工程"
    		+ "F、生命健康"
    		+ "G、现代农业"
    		+ "H、集成电路"
    		+ "I、新材料"
    		+ "J、交通装备"
    		+ "K、节能环保"
    		+ "L、文化与科技融合"
    		+ "M、现代服务业"
    		+ "N、军民融合")
	private String techArea;
    /**
	 * 驱动人数排序标识
	 */
    @ApiModelProperty(value = "驱动人数排序标识（0:升序1:降序）")
	private String conFlg;
    /**
	 * 驱动现额排序标识
	 */
    @ApiModelProperty(value = "驱动现额排序标识（0:升序1:降序）")
	private String cashFlg;
    /**
	 * 用户ID
	 */
    @ApiModelProperty(value = "用户ID")
	private String userId;
    
    /**
	 * 设置： 大盘ID
	 */
	public void setMarketId(String marketId) {
		this.marketId = marketId;
	}
	/**
	 * 获取： 大盘ID
	 */
	public String getMarketId() {
		return marketId;
	}
    
    /**
	 * 设置： 技术领域
	 */
	public void setTechArea(String techArea) {
		this.techArea = techArea;
	}
	/**
	 * 获取： 技术领域
	 */
	public String getTechArea() {
		return techArea;
	}

	/**
	 * 设置：技术名称
	 */
	public void setTechName(String techName) {
		this.techName = techName;
	}
	/**
	 * 获取：技术名称
	 */
	public String getTechName() {
		return techName;
	}
	/**
	 * 设置：驱动人数排序标识
	 */
	public void setConFlg(String conFlg) {
		this.conFlg = conFlg;
	}
	/**
	 * 获取：驱动人数排序标识
	 */
	public String getConFlg() {
		return conFlg;
	}
	/**
	 * 设置：驱动现额排序标识
	 */
	public void setCashFlg(String cashFlg) {
		this.cashFlg = cashFlg;
	}
	/**
	 * 获取：驱动现额排序标识
	 */
	public String getCashFlg() {
		return cashFlg;
	}
	/**
	 * 设置： 用户ID
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * 获取： 用户ID
	 */
	public String getUserId() {
		return userId;
	}
	
}
