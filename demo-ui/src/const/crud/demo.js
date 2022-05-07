export const tableOption =
{"searchSize": 'mini',"align": "center", "index": true, "border": true,
"column": [{"prop": "id", "type": "input", "label": "主键", "addDisplay": false, "editDisabled": true},
{"prop": "username", "type": "input", "label": "用户名", "addDisplay": true, "editDisabled": false,"search":true}, {"prop": "nicename", "type": "input", "label": "昵称", "addDisplay": true, "editDisabled": false, "search": true},
  {"prop": "createBy", "type": "input", "label": "创建人", "addDisplay": false, "editDisabled": false},
  {"prop": "updateTime", "type": "input", "label": "修改时间", "addDisplay": false, "editDisabled": true, "format": "yyyy-MM-dd HH:mm:ss"},
  {"prop": "updateBy", "type": "input", "label": "更新人", "addDisplay": false, "editDisabled": false},
  {"prop": "createTime", "span": 24, "type": "datetime", "label": "创建时间",   "format": "yyyy-MM-dd HH:mm:ss", "valueFormat": "yyyy-MM-dd HH:mm:ss", "display": false},
  {"prop": "1651561941141_62353", "span": 24, "type": "map", "label": "地图选择器", "display": true, "component": "avue-input-map"},
  {"prop": "1651562249334_50291", "span": 24, "type": "ueditor", "label": "富文本", "display": true, "options": {"ali": {}, "oss": "", "props": {}, "qiniu": {}, "action": ""}, "component": "avue-ueditor"},
  {"prop": "1651562389559_38768", "span": 24, "type": "upload", "label": "上传", "limit": 10, "display": true, "multiple": true, "propsHttp": {}, "canvasOption": {}, "showFileList": true}], "gutter": 0, "stripe": true,
"menuBtn": true, "emptyBtn": true, "emptyText": "清空", "menuAlign": "center", "submitBtn": true, "indexLabel": "序号", "labelWidth": 120, "submitText": "提交", "labelSuffix": "：", "menuPosition": "center", "labelPosition": "left", "searchMenuSpan": 6}
