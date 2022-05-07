export const tableOption = {
  "border": true,
  "index": true,
  "indexLabel": "序号",
  "stripe": true,
  "menuAlign": "center",
  "align": "center",
  "searchMenuSpan": 6,
  "column": [
    {
      "type": "input",
      "label": "id",
      "prop": "id",
      "addDisplay": false,
      "editDisabled": true,
      "addDisplay":false,
      "showDisplay":false,
      "hide":true
    },

    {
      "type": "input",
      "label": "抖音appid",
      "prop": "uid"
    },
    {
      "type": "input",
      "label": "抖音星图id",
      "prop": "uniqueId"
    },
    {
      "type": "input",
      "label": "nickName",
      "prop": "nickName"
    },
    {
      "type": "input",
      "label": "头像地址",
      "prop": "avatarLink",
      "hide":true
    },
    {
      "type": "input",
      "label": "省",
      "prop": "province"
    },
    {
      "type": "input",
      "label": "市",
      "prop": "city"
    },
  
    {"prop": "gender", "span": 12, "type": "select", "label": "性别", 
    "props": {"label": "label", "value": ""}, "dicData": [{"label": "男", "value": "1"}, {"label": "女", "value": "0"}, {"label": "其他", "value": "2"}], 
    "display": true, "editDisabled": false, "dataType": "string"
    },

    {
      "type": "input",
      "label": "点赞数量",
      "prop": "totalLike"
    },
    {
      "type": "input",
      "label": "平均点赞",
      "prop": "avgLike",
      "sortable":true
    },
    {
      "type": "input",
      "label": "粉丝数量",
      "prop": "fansCount"
    },
    {
      "type": "input",
      "label": "关注数量",
      "prop": "focusCount"
    },
    {
      "type": "input",
      "label": "真粉数量",
      "prop": "realFansCount"
    },
    {
      "type": "input",
      "label": "用户提出的价格",
      "prop": "price",
      "hide":true
    },
    {
      "type": "input",
      "label": "计算的真实价值：",
      "prop": "value",
      "hide":true
    },
    {
      "type": "input",
      "label": "用户领域",
      "prop": "type"
    },
    {
      "type": "input",
      "label": "总播放量",
      "prop": "totalPlayNum"
    },
    {
      "type": "input",
      "label": "平均播放量",
      "prop": "avgPlayNum"
    },
    {
      "type": "input",
      "label": "预期播放量",
      "prop": "prePlayNum"
    },
    {
      "type": "input",
      "label": "单位粉丝贡献播放量",
      "prop": "playNumUnit",
      "hide":true
    },
    {
      "type": "input",
      "label": "互动率",
      "prop": "interactionNum"
    },
    {
      "type": "input",
      "label": "总评论数",
      "prop": "totalCommentNum"
    },
    {
      "type": "input",
      "label": "平均评论数",
      "prop": "avgComment"
    },
    {
      "type": "input",
      "label": "总分享数",
      "prop": "totalShareNum"
    },
    {
      "type": "input",
      "label": "平均分享数",
      "prop": "avgShareNum"
    },
    {
      "type": "input",
      "label": "发表的动态数量",
      "prop": "totalDynaicNum"
    },
    {
      "type": "input",
      "label": "传播力",
      "prop": "communicationValue"
    },
    {
      "type": "input",
      "label": "粉丝特征",
      "prop": "fansFeature",
      "hide":true
    },
    {
      "type": "input",
      "label": "年龄",
      "prop": "age"
    },
    {
      "type": "input",
      "label": "用户描述",
      "prop": "signature",
      "hide":true
    },
    {
      "type": "input",
      "label": "视频数",
      "prop": "videoCount"
    },
    {
      "type": "input",
      "label": "isVerified",
      "prop": "isVerified"
    },
    {
      "type": "input",
      "label": "birthday",
      "prop": "birthday"
    },
    {
      "type": "input",
      "label": "cpm",
      "prop": "cpm"
    },
    {
      "type": "input",
      "label": "xtPrePlayNum",
      "prop": "xtPrePlayNum"
    },
    {
      "type": "input",
      "label": "xtCpm",
      "prop": "xtCpm"
    },
    {
      "type": "input",
      "label": "星图上任务完成数",
      "prop": "xtOrderCompleteNum",
      "hide":true
    },
    {
      "type": "input",
      "label": "扩展字段",
      "prop": "other",
      "hide":true
    },
    {
      "type": "input",
      "label": "平台id",
      "prop": "platformId",
      "hide":true

    },
    {
      "type": "input",
      "label": "喜欢的作品数量",
      "prop": "favoritingCount",
      "hide":true
    },
    {
      "type": "input",
      "label": "爬虫扩展字段：来源",
      "prop": "datafrom",
      "hide":true
    },
    {
      "type": "input",
      "label": "星图id",
      "prop": "oid",
      "hide":true
    },
    {
      "type": "input",
      "label": "平均制作周期",
      "prop": "orderAvgTimeCost"
    },
    {
      "type": "input",
      "label": "星图达人指数",
      "prop": "topScore"
    },
    {
      "type": "input",
      "label": "星图合作指数",
      "prop": "cooperateIndex"
    },
    {
      "type": "input",
      "label": "星图传播指数",
      "prop": "spreadIndex"
    },
    {
      "type": "input",
      "label": "达人风格标签",
      "prop": "userStyle",
      "hide":true
    }
  ]
}
